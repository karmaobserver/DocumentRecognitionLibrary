package com.makaji.aleksej.documentdetector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Region;
import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

import java.io.IOException;
import java.io.InputStream;

import static org.opencv.android.LoaderCallbackInterface.SUCCESS;

/**
 * Created by Aleksej on 9/21/2017.
 */

@EBean
public class DocumentDetector {

    @RootContext
    Context context;

    private static final String DATASET_NAME = "dataset";

    private static final String TAG = "DocumentDetector";

}
