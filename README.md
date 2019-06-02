# JNI4NDK

android 通过NDK实现JNI

Android JNI实现 - 简书：https://www.jianshu.com/p/bb77c6cfd23f

JNI和NDK
JNI是Java调用Native 语言的一种特性，属于Java，Java本地接口，使Java与本地其他类型语言交互（C++）
实现步骤：在Java中声明Native方法，编译该文件得到.class文件，通过javah命令导出JNI头文件（.h文件），使用Java需要交互的本地代码实现子啊Java中声明的Native方法，编译so文件，通过Java执行Java程序，最终实现Java调用本地代码
NDK（Native Develop Kit）：Android开发工具包，属于Android。
作用：快速开发C、C++动态库，并自动将so文件和应用打包成APK，即可通过NDK在Android中使用JNI与本地代码（C、C++）交互（Android开发需要本地代码C、C++实现）
特点：运行效率高，代码安全性高，功能拓展性好，易于代码复用和移植。
使用步骤：①配置NDK环境；②创建Android项目，并于NDK进行关联；③在Android项目中声明所需调用的Native方法；④使用该Native方法；⑤通过NDK build命令编译产生so文件；⑥编译AS工程，实现调用本地代码。
JNI和NDK的关系：JNI实现目的，NDK是Android实现JNI的手段，即在AS开发环境中通过NDK从而实现JNI功能。
