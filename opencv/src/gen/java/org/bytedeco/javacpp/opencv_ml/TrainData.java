// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

import static org.bytedeco.javacpp.opencv_ml.opencv_ml.*;


/** \brief Class encapsulating training data.
<p>
Please note that the class only specifies the interface of training data, but not implementation.
All the statistical model classes in _ml_ module accepts Ptr\<TrainData\> as parameter. In other
words, you can create your own class derived from TrainData and pass smart pointer to the instance
of this class into StatModel::train.
<p>
@see \ref ml_intro_data
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.javacpp.opencv_ml.opencv_ml_presets.class)
public class TrainData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrainData(Pointer p) { super(p); }

    public static native float missingValue();

    public native int getLayout();
    public native int getNTrainSamples();
    public native int getNTestSamples();
    public native int getNSamples();
    public native int getNVars();
    public native int getNAllVars();

    public native void getSample(@ByVal Mat varIdx, int sidx, FloatPointer buf);
    public native void getSample(@ByVal Mat varIdx, int sidx, FloatBuffer buf);
    public native void getSample(@ByVal Mat varIdx, int sidx, float[] buf);
    public native void getSample(@ByVal UMat varIdx, int sidx, FloatPointer buf);
    public native void getSample(@ByVal UMat varIdx, int sidx, FloatBuffer buf);
    public native void getSample(@ByVal UMat varIdx, int sidx, float[] buf);
    public native void getSample(@ByVal GpuMat varIdx, int sidx, FloatPointer buf);
    public native void getSample(@ByVal GpuMat varIdx, int sidx, FloatBuffer buf);
    public native void getSample(@ByVal GpuMat varIdx, int sidx, float[] buf);
    public native @ByVal Mat getSamples();
    public native @ByVal Mat getMissing();

    /** \brief Returns matrix of train samples
    <p>
    @param layout The requested layout. If it's different from the initial one, the matrix is
        transposed. See ml::SampleTypes.
    @param compressSamples if true, the function returns only the training samples (specified by
        sampleIdx)
    @param compressVars if true, the function returns the shorter training samples, containing only
        the active variables.
    <p>
    In current implementation the function tries to avoid physical data copying and returns the
    matrix stored inside TrainData (unless the transposition or compression is needed).
     */
    public native @ByVal Mat getTrainSamples(int layout/*=cv::ml::ROW_SAMPLE*/,
                                    @Cast("bool") boolean compressSamples/*=true*/,
                                    @Cast("bool") boolean compressVars/*=true*/);
    public native @ByVal Mat getTrainSamples();

    /** \brief Returns the vector of responses
    <p>
    The function returns ordered or the original categorical responses. Usually it's used in
    regression algorithms.
     */
    public native @ByVal Mat getTrainResponses();

    /** \brief Returns the vector of normalized categorical responses
    <p>
    The function returns vector of responses. Each response is integer from {@code 0} to {@code <number of
    classes>-1}. The actual label value can be retrieved then from the class label vector, see
    TrainData::getClassLabels.
     */
    public native @ByVal Mat getTrainNormCatResponses();
    public native @ByVal Mat getTestResponses();
    public native @ByVal Mat getTestNormCatResponses();
    public native @ByVal Mat getResponses();
    public native @ByVal Mat getNormCatResponses();
    public native @ByVal Mat getSampleWeights();
    public native @ByVal Mat getTrainSampleWeights();
    public native @ByVal Mat getTestSampleWeights();
    public native @ByVal Mat getVarIdx();
    public native @ByVal Mat getVarType();
    public native @ByVal Mat getVarSymbolFlags();
    public native int getResponseType();
    public native @ByVal Mat getTrainSampleIdx();
    public native @ByVal Mat getTestSampleIdx();
    public native void getValues(int vi, @ByVal Mat sidx, FloatPointer values);
    public native void getValues(int vi, @ByVal Mat sidx, FloatBuffer values);
    public native void getValues(int vi, @ByVal Mat sidx, float[] values);
    public native void getValues(int vi, @ByVal UMat sidx, FloatPointer values);
    public native void getValues(int vi, @ByVal UMat sidx, FloatBuffer values);
    public native void getValues(int vi, @ByVal UMat sidx, float[] values);
    public native void getValues(int vi, @ByVal GpuMat sidx, FloatPointer values);
    public native void getValues(int vi, @ByVal GpuMat sidx, FloatBuffer values);
    public native void getValues(int vi, @ByVal GpuMat sidx, float[] values);
    public native void getNormCatValues(int vi, @ByVal Mat sidx, IntPointer values);
    public native void getNormCatValues(int vi, @ByVal Mat sidx, IntBuffer values);
    public native void getNormCatValues(int vi, @ByVal Mat sidx, int[] values);
    public native void getNormCatValues(int vi, @ByVal UMat sidx, IntPointer values);
    public native void getNormCatValues(int vi, @ByVal UMat sidx, IntBuffer values);
    public native void getNormCatValues(int vi, @ByVal UMat sidx, int[] values);
    public native void getNormCatValues(int vi, @ByVal GpuMat sidx, IntPointer values);
    public native void getNormCatValues(int vi, @ByVal GpuMat sidx, IntBuffer values);
    public native void getNormCatValues(int vi, @ByVal GpuMat sidx, int[] values);
    public native @ByVal Mat getDefaultSubstValues();

    public native int getCatCount(int vi);

    /** \brief Returns the vector of class labels
    <p>
    The function returns vector of unique labels occurred in the responses.
     */
    public native @ByVal Mat getClassLabels();

    public native @ByVal Mat getCatOfs();
    public native @ByVal Mat getCatMap();

    /** \brief Splits the training data into the training and test parts
    @see TrainData::setTrainTestSplitRatio
     */
    public native void setTrainTestSplit(int count, @Cast("bool") boolean shuffle/*=true*/);
    public native void setTrainTestSplit(int count);

    /** \brief Splits the training data into the training and test parts
    <p>
    The function selects a subset of specified relative size and then returns it as the training
    set. If the function is not called, all the data is used for training. Please, note that for
    each of TrainData::getTrain\* there is corresponding TrainData::getTest\*, so that the test
    subset can be retrieved and processed as well.
    @see TrainData::setTrainTestSplit
     */
    public native void setTrainTestSplitRatio(double ratio, @Cast("bool") boolean shuffle/*=true*/);
    public native void setTrainTestSplitRatio(double ratio);
    public native void shuffleTrainTest();

    /** \brief Returns matrix of test samples */
    public native @ByVal Mat getTestSamples();

    /** \brief Returns vector of symbolic names captured in loadFromCSV() */
    public native void getNames(@ByRef StringVector names);

    /** \brief Extract from 1D vector elements specified by passed indexes.
    @param vec input vector (supported types: CV_32S, CV_32F, CV_64F)
    @param idx 1D index vector
     */
    public static native @ByVal Mat getSubVector(@Const @ByRef Mat vec, @Const @ByRef Mat idx);

    /** \brief Extract from matrix rows/cols specified by passed indexes.
    @param matrix input matrix (supported types: CV_32S, CV_32F, CV_64F)
    @param idx 1D index vector
    @param layout specifies to extract rows (cv::ml::ROW_SAMPLES) or to extract columns (cv::ml::COL_SAMPLES)
     */
    public static native @ByVal Mat getSubMatrix(@Const @ByRef Mat matrix, @Const @ByRef Mat idx, int layout);

    /** \brief Reads the dataset from a .csv file and returns the ready-to-use training data.
    <p>
    @param filename The input file name
    @param headerLineCount The number of lines in the beginning to skip; besides the header, the
        function also skips empty lines and lines staring with {@code #}
    @param responseStartIdx Index of the first output variable. If -1, the function considers the
        last variable as the response
    @param responseEndIdx Index of the last output variable + 1. If -1, then there is single
        response variable at responseStartIdx.
    @param varTypeSpec The optional text string that specifies the variables' types. It has the
        format {@code ord[n1-n2,n3,n4-n5,...]cat[n6,n7-n8,...]}. That is, variables from {@code n1 to n2}
        (inclusive range), {@code n3}, {@code n4 to n5} ... are considered ordered and {@code n6}, {@code n7 to n8} ... are
        considered as categorical. The range {@code [n1..n2] + [n3] + [n4..n5] + ... + [n6] + [n7..n8]}
        should cover all the variables. If varTypeSpec is not specified, then algorithm uses the
        following rules:
        - all input variables are considered ordered by default. If some column contains has non-
          numerical values, e.g. 'apple', 'pear', 'apple', 'apple', 'mango', the corresponding
          variable is considered categorical.
        - if there are several output variables, they are all considered as ordered. Error is
          reported when non-numerical values are used.
        - if there is a single output variable, then if its values are non-numerical or are all
          integers, then it's considered categorical. Otherwise, it's considered ordered.
    @param delimiter The character used to separate values in each line.
    @param missch The character used to specify missing measurements. It should not be a digit.
        Although it's a non-numerical value, it surely does not affect the decision of whether the
        variable ordered or categorical.
    \note If the dataset only contains input variables and no responses, use responseStartIdx = -2
        and responseEndIdx = 0. The output variables vector will just contain zeros.
     */
    public static native @Ptr TrainData loadFromCSV(@Str BytePointer filename,
                                          int headerLineCount,
                                          int responseStartIdx/*=-1*/,
                                          int responseEndIdx/*=-1*/,
                                          @Str BytePointer varTypeSpec/*=cv::String()*/,
                                          @Cast("char") byte delimiter/*=','*/,
                                          @Cast("char") byte missch/*='?'*/);
    public static native @Ptr TrainData loadFromCSV(@Str BytePointer filename,
                                          int headerLineCount);
    public static native @Ptr TrainData loadFromCSV(@Str String filename,
                                          int headerLineCount,
                                          int responseStartIdx/*=-1*/,
                                          int responseEndIdx/*=-1*/,
                                          @Str String varTypeSpec/*=cv::String()*/,
                                          @Cast("char") byte delimiter/*=','*/,
                                          @Cast("char") byte missch/*='?'*/);
    public static native @Ptr TrainData loadFromCSV(@Str String filename,
                                          int headerLineCount);

    /** \brief Creates training data from in-memory arrays.
    <p>
    @param samples matrix of samples. It should have CV_32F type.
    @param layout see ml::SampleTypes.
    @param responses matrix of responses. If the responses are scalar, they should be stored as a
        single row or as a single column. The matrix should have type CV_32F or CV_32S (in the
        former case the responses are considered as ordered by default; in the latter case - as
        categorical)
    @param varIdx vector specifying which variables to use for training. It can be an integer vector
        (CV_32S) containing 0-based variable indices or byte vector (CV_8U) containing a mask of
        active variables.
    @param sampleIdx vector specifying which samples to use for training. It can be an integer
        vector (CV_32S) containing 0-based sample indices or byte vector (CV_8U) containing a mask
        of training samples.
    @param sampleWeights optional vector with weights for each sample. It should have CV_32F type.
    @param varType optional vector of type CV_8U and size {@code <number_of_variables_in_samples> +
        <number_of_variables_in_responses>}, containing types of each input and output variable. See
        ml::VariableTypes.
     */
    public static native @Ptr TrainData create(@ByVal Mat samples, int layout, @ByVal Mat responses,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat varIdx, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat sampleIdx,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat sampleWeights, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat varType);
    public static native @Ptr TrainData create(@ByVal Mat samples, int layout, @ByVal Mat responses);
    public static native @Ptr TrainData create(@ByVal UMat samples, int layout, @ByVal UMat responses,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat varIdx, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat sampleIdx,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat sampleWeights, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat varType);
    public static native @Ptr TrainData create(@ByVal UMat samples, int layout, @ByVal UMat responses);
    public static native @Ptr TrainData create(@ByVal GpuMat samples, int layout, @ByVal GpuMat responses,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat varIdx, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat sampleIdx,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat sampleWeights, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat varType);
    public static native @Ptr TrainData create(@ByVal GpuMat samples, int layout, @ByVal GpuMat responses);
}