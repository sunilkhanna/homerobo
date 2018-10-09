/***************************************************************************
 *  Copyright (C) Belgacom 2013
 *
 *  The reproduction, transmission or use of this document  or its contents
 *  is not  permitted without  prior express written consent of Belgacom.
 *  Offenders will be liable for damages. All rights, including  but not
 *  limited to rights created by patent grant or registration of a utility
 *  model or design, are reserved.
 *
 *  Belgacom reserves the right to modify technical specifications and features.
 *
 *  Technical specifications and features are binding only insofar as they
 *  are specifically and expressly agreed upon in a written contract.
 *
 **************************************************************************/

package org.sample.opencv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import org.opencv.videoio.*;


/**
 * @author sunil.khanna
 *
 */
public class MyFirstApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		String imgFile = "C:\\Users\\sunil.khanna\\Downloads\\me.jpg";
		Mat src = Imgcodecs.imread(imgFile);

		// CascadeClassifier

		String xmlFile = "C:\\Users\\sunil.khanna\\Downloads\\opencv-3.4.0\\samples\\android\\face-detection\\res\\raw\\lbpcascade_frontalface.xml";
		CascadeClassifier classifier = new CascadeClassifier(xmlFile);

		// Detecting the face in the snap
		MatOfRect faceDetections = new MatOfRect();
		classifier.detectMultiScale(src, faceDetections);
		System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
		
		// Drawing boxes
	      for (Rect rect : faceDetections.toArray()) {
	         Imgproc.rectangle(
	            src,                                               // where to draw the box
	            new Point(rect.x, rect.y),                            // bottom left
	            new Point(rect.x + rect.width, rect.y + rect.height), // top right
	            new Scalar(0, 0, 0),
	            3                                                     // RGB colour
	         );
	      }

	      // Writing the image
	      Imgcodecs.imwrite("D:/output11.jpg", src);

	      System.out.println("Image Processed");
		

	}

}
