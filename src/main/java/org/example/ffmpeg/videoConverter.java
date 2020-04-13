package org.example.ffmpeg;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.Java2DFrameConverter;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class videoConverter implements Runnable {
    //*
    // this opens a video file and make grab frame to single png file
    //*
    FFmpegFrameGrabber frameGrabber;
    Thread thread;
    boolean running = false;
    String outPath;

    public videoConverter(String inputVideo, String destinationPath) {
        frameGrabber = new FFmpegFrameGrabber(inputVideo);
        outPath = destinationPath;
    }

    private int getFramesCount() {
        return this.frameGrabber.getLengthInFrames();
    }

    private BufferedImage getImage(int frameNumber) throws FrameGrabber.Exception {
        frameGrabber.setFrameNumber(frameNumber);
        Frame frame = frameGrabber.grabImage();
        BufferedImage image;
        image = new Java2DFrameConverter().convert(frame);
        return image;
    }

    public synchronized void start() throws FrameGrabber.Exception {
        frameGrabber.start();
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
            frameGrabber.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int i = 0;
        int frames = getFramesCount();
        while (running) {
            try {
                ImageIO.write(getImage(i), "png", new File(outPath + i + ".png"));
                i++;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (i >= frames) {
                break;
            }
        }
        try {
            frameGrabber.stop();
        } catch (FrameGrabber.Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FrameGrabber.Exception {
        videoConverter img = new videoConverter("D:\\a\\MOV_0402.mp4", "D:\\a\\");
        img.start();
    }
}
