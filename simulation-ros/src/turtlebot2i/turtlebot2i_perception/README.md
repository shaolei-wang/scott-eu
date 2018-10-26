# 1. Overview

This package provides the perception methods for the turtlebot2i robot. Until now this package has the obstacle detection and recognition node that uses [Mask R-CNN method](https://github.com/matterport/Mask_RCNN).

# 2. Mask R-CNN (MRCNN)

MRCNN is the state-of-art method for obstacle detection and recognition. It is based on the region-based convolutional neural network (R-CNN) and has the main characteristic of returning the boundary of the detected object (mask). More information can be found in the following paper: https://arxiv.org/abs/1703.06870

**As the MRCNN is built with python 3.5 (ROS runs with python 2.7), it is necessary some preparations in the machine to make the code run together with ROS.**

# 3. Porting MRCNN to ROS

The following guideline is intended to make the RCNN run inside ROS. The approch shown here makes MRCNN node run using python 3.5, so basically all ROS imports are adapted to support python 3.5.

1. Prepare ROS for python 3.5

```
$ sudo apt-get install python3-yaml
$ sudo pip3 install rospkg catkin_pkg
```

2. Install OpenCV for python 3.5

```
$ pip3 install opencv-python
```

3. Install cv_bridge
Follow the instructions in https://stackoverflow.com/questions/49221565/unable-to-use-cv-bridge-with-ros-kinetic-and-python3

4. Install MRCNN library

```
$ sudo pip3 install tensorflow
$ sudo pip3 install mrcnn

```

**For the previous steps, install the required depences, if necessary.**

5. Change the MRCNN source to support threads. It is necessary to apply a patch.

```
$ patch /usr/local/lib/python3.5/dist-packages/mask_rcnn-2.1-py3.5.egg misc/mask_rcnn-2.1-py3.5.egg.patch
```

# 4. Download the pretrained MRCNN models (TODO)
```

```


# 5. Run the Mask R-CNN

```
$ rosrun turtlebot2i_perception ros_mrcnn.py

```
