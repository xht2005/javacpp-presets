// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

import static org.bytedeco.javacpp.opencv_ml.opencv_ml.*;


/****************************************************************************************\
*                                   Gradient Boosted Trees                               *
\****************************************************************************************/

/*class CV_EXPORTS_W GBTrees : public DTrees
{
public:
    struct CV_EXPORTS_W_MAP Params : public DTrees::Params
    {
        CV_PROP_RW int weakCount;
        CV_PROP_RW int lossFunctionType;
        CV_PROP_RW float subsamplePortion;
        CV_PROP_RW float shrinkage;

        Params();
        Params( int lossFunctionType, int weakCount, float shrinkage,
                float subsamplePortion, int maxDepth, bool useSurrogates );
    };

    enum {SQUARED_LOSS=0, ABSOLUTE_LOSS, HUBER_LOSS=3, DEVIANCE_LOSS};

    virtual void setK(int k) = 0;

    virtual float predictSerial( InputArray samples,
                                 OutputArray weakResponses, int flags) const = 0;

    static Ptr<GBTrees> create(const Params& p);
};*/

/****************************************************************************************\
*                              Artificial Neural Networks (ANN)                          *
\****************************************************************************************/

/////////////////////////////////// Multi-Layer Perceptrons //////////////////////////////

/** \brief Artificial Neural Networks - Multi-Layer Perceptrons.
<p>
Unlike many other models in ML that are constructed and trained at once, in the MLP model these
steps are separated. First, a network with the specified topology is created using the non-default
constructor or the method ANN_MLP::create. All the weights are set to zeros. Then, the network is
trained using a set of input and output vectors. The training procedure can be repeated more than
once, that is, the weights can be adjusted based on the new training data.
<p>
Additional flags for StatModel::train are available: ANN_MLP::TrainFlags.
<p>
@see \ref ml_intro_ann
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.javacpp.opencv_ml.opencv_ml_presets.class)
public class ANN_MLP extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ANN_MLP(Pointer p) { super(p); }

    /** Available training methods */
    /** enum cv::ml::ANN_MLP::TrainingMethods */
    public static final int
        /** The back-propagation algorithm. */
        BACKPROP = 0,
        /** The RPROP algorithm. See \cite RPROP93 for details. */
        RPROP = 1,
        /** The simulated annealing algorithm. See \cite Kirkpatrick83 for details. */
        ANNEAL = 2;

    /** Sets training method and common parameters.
    @param method Default value is ANN_MLP::RPROP. See ANN_MLP::TrainingMethods.
    @param param1 passed to setRpropDW0 for ANN_MLP::RPROP and to setBackpropWeightScale for ANN_MLP::BACKPROP and to initialT for ANN_MLP::ANNEAL.
    @param param2 passed to setRpropDWMin for ANN_MLP::RPROP and to setBackpropMomentumScale for ANN_MLP::BACKPROP and to finalT for ANN_MLP::ANNEAL.
    */
    public native void setTrainMethod(int method, double param1/*=0*/, double param2/*=0*/);
    public native void setTrainMethod(int method);

    /** Returns current training method */
    public native int getTrainMethod();

    /** Initialize the activation function for each neuron.
    Currently the default and the only fully supported activation function is ANN_MLP::SIGMOID_SYM.
    @param type The type of activation function. See ANN_MLP::ActivationFunctions.
    @param param1 The first parameter of the activation function, \f$\alpha\f$. Default value is 0.
    @param param2 The second parameter of the activation function, \f$\beta\f$. Default value is 0.
    */
    public native void setActivationFunction(int type, double param1/*=0*/, double param2/*=0*/);
    public native void setActivationFunction(int type);

    /**  Integer vector specifying the number of neurons in each layer including the input and output layers.
    The very first element specifies the number of elements in the input layer.
    The last element - number of elements in the output layer. Default value is empty Mat.
    @see getLayerSizes */
    public native void setLayerSizes(@ByVal Mat _layer_sizes);
    public native void setLayerSizes(@ByVal UMat _layer_sizes);
    public native void setLayerSizes(@ByVal GpuMat _layer_sizes);

    /**  Integer vector specifying the number of neurons in each layer including the input and output layers.
    The very first element specifies the number of elements in the input layer.
    The last element - number of elements in the output layer.
    @see setLayerSizes */
    public native @ByVal Mat getLayerSizes();

    /** Termination criteria of the training algorithm.
    You can specify the maximum number of iterations (maxCount) and/or how much the error could
    change between the iterations to make the algorithm continue (epsilon). Default value is
    TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 1000, 0.01).*/
    /** @see setTermCriteria */
    public native @ByVal TermCriteria getTermCriteria();
    /** \copybrief getTermCriteria @see getTermCriteria */
    public native void setTermCriteria(@ByVal TermCriteria val);

    /** BPROP: Strength of the weight gradient term.
    The recommended value is about 0.1. Default value is 0.1.*/
    /** @see setBackpropWeightScale */
    public native double getBackpropWeightScale();
    /** \copybrief getBackpropWeightScale @see getBackpropWeightScale */
    public native void setBackpropWeightScale(double val);

    /** BPROP: Strength of the momentum term (the difference between weights on the 2 previous iterations).
    This parameter provides some inertia to smooth the random fluctuations of the weights. It can
    vary from 0 (the feature is disabled) to 1 and beyond. The value 0.1 or so is good enough.
    Default value is 0.1.*/
    /** @see setBackpropMomentumScale */
    public native double getBackpropMomentumScale();
    /** \copybrief getBackpropMomentumScale @see getBackpropMomentumScale */
    public native void setBackpropMomentumScale(double val);

    /** RPROP: Initial value \f$\Delta_0\f$ of update-values \f$\Delta_{ij}\f$.
    Default value is 0.1.*/
    /** @see setRpropDW0 */
    public native double getRpropDW0();
    /** \copybrief getRpropDW0 @see getRpropDW0 */
    public native void setRpropDW0(double val);

    /** RPROP: Increase factor \f$\eta^+\f$.
    It must be \>1. Default value is 1.2.*/
    /** @see setRpropDWPlus */
    public native double getRpropDWPlus();
    /** \copybrief getRpropDWPlus @see getRpropDWPlus */
    public native void setRpropDWPlus(double val);

    /** RPROP: Decrease factor \f$\eta^-\f$.
    It must be \<1. Default value is 0.5.*/
    /** @see setRpropDWMinus */
    public native double getRpropDWMinus();
    /** \copybrief getRpropDWMinus @see getRpropDWMinus */
    public native void setRpropDWMinus(double val);

    /** RPROP: Update-values lower limit \f$\Delta_{min}\f$.
    It must be positive. Default value is FLT_EPSILON.*/
    /** @see setRpropDWMin */
    public native double getRpropDWMin();
    /** \copybrief getRpropDWMin @see getRpropDWMin */
    public native void setRpropDWMin(double val);

    /** RPROP: Update-values upper limit \f$\Delta_{max}\f$.
    It must be \>1. Default value is 50.*/
    /** @see setRpropDWMax */
    public native double getRpropDWMax();
    /** \copybrief getRpropDWMax @see getRpropDWMax */
    public native void setRpropDWMax(double val);

    /** ANNEAL: Update initial temperature.
    It must be \>=0. Default value is 10.*/
    /** @see setAnnealInitialT */
    public native double getAnnealInitialT();
    /** \copybrief getAnnealInitialT @see getAnnealInitialT */
    public native void setAnnealInitialT(double val);

    /** ANNEAL: Update final temperature.
    It must be \>=0 and less than initialT. Default value is 0.1.*/
    /** @see setAnnealFinalT */
    public native double getAnnealFinalT();
    /** \copybrief getAnnealFinalT @see getAnnealFinalT */
    public native void setAnnealFinalT(double val);

    /** ANNEAL: Update cooling ratio.
    It must be \>0 and less than 1. Default value is 0.95.*/
    /** @see setAnnealCoolingRatio */
    public native double getAnnealCoolingRatio();
    /** \copybrief getAnnealCoolingRatio @see getAnnealCoolingRatio */
    public native void setAnnealCoolingRatio(double val);

    /** ANNEAL: Update iteration per step.
    It must be \>0 . Default value is 10.*/
    /** @see setAnnealItePerStep */
    public native int getAnnealItePerStep();
    /** \copybrief getAnnealItePerStep @see getAnnealItePerStep */
    public native void setAnnealItePerStep(int val);

    /** \brief Set/initialize anneal RNG */
    public native void setAnnealEnergyRNG(@Const @ByRef RNG rng);

    /** possible activation functions */
    /** enum cv::ml::ANN_MLP::ActivationFunctions */
    public static final int
        /** Identity function: \f$f(x)=x\f$ */
        IDENTITY = 0,
        /** Symmetrical sigmoid: \f$f(x)=\beta*(1-e^{-\alpha x})/(1+e^{-\alpha x})\f$
        \note
        If you are using the default sigmoid activation function with the default parameter values
        fparam1=0 and fparam2=0 then the function used is y = 1.7159\*tanh(2/3 \* x), so the output
        will range from [-1.7159, 1.7159], instead of [0,1].*/
        SIGMOID_SYM = 1,
        /** Gaussian function: \f$f(x)=\beta e^{-\alpha x*x}\f$ */
        GAUSSIAN = 2,
        /** ReLU function: \f$f(x)=max(0,x)\f$ */
        RELU = 3,
        /** Leaky ReLU function: for x>0 \f$f(x)=x \f$ and x<=0 \f$f(x)=\alpha x \f$*/
        LEAKYRELU = 4;

    /** Train options */
    /** enum cv::ml::ANN_MLP::TrainFlags */
    public static final int
        /** Update the network weights, rather than compute them from scratch. In the latter case
        the weights are initialized using the Nguyen-Widrow algorithm. */
        UPDATE_WEIGHTS = 1,
        /** Do not normalize the input vectors. If this flag is not set, the training algorithm
        normalizes each input feature independently, shifting its mean value to 0 and making the
        standard deviation equal to 1. If the network is assumed to be updated frequently, the new
        training data could be much different from original one. In this case, you should take care
        of proper normalization. */
        NO_INPUT_SCALE = 2,
        /** Do not normalize the output vectors. If the flag is not set, the training algorithm
        normalizes each output feature independently, by transforming it to the certain range
        depending on the used activation function. */
        NO_OUTPUT_SCALE = 4;

    public native @ByVal Mat getWeights(int layerIdx);

    /** \brief Creates empty model
    <p>
    Use StatModel::train to train the model, Algorithm::load\<ANN_MLP\>(filename) to load the pre-trained model.
    Note that the train method has optional flags: ANN_MLP::TrainFlags.
     */
    public static native @Ptr ANN_MLP create();

    /** \brief Loads and creates a serialized ANN from a file
     *
     * Use ANN::save to serialize and store an ANN to disk.
     * Load the ANN from this file again, by calling this function with the path to the file.
     *
     * @param filepath path to serialized ANN
     */
    public static native @Ptr ANN_MLP load(@Str BytePointer filepath);
    public static native @Ptr ANN_MLP load(@Str String filepath);

}