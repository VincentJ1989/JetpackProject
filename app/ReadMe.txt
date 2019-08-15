Navigation
1.参照官网，添加依赖：https://developer.android.google.cn/jetpack/androidx/releases/navigation
2.在res下创建一个类型为navigation的资源文件，例如nav_graph
3.创建所需的各个Fragment
4.在nav_graph配置页面跳转.要注意，第一个要选取起始的Fragment
5.在Fragment中实例化NavController，增加相关的跳转
6.传参使用bundleOf()生成bundle，然后传递即可。(官方有个在nav_graph配置的写法没去研究https://developer.android.google.cn/guide/navigation/navigation-pass-data)
如果传递对象，需要实现Parcelable接口。
在APP下的build_gradle的android{}中，增加如下代码可以简化Bean类·
    androidExtensions {
        experimental = true
    }
7.在action中配置页面进出的动画(有4个)
8.app:popUpTo="@id/navMainFragment" app:popUpToInclusive="true"这2个的作用其实就是类似于navMainFragment在执行这次Action跳转后不加入返回栈，
即跳转后点击返回不会回到navMainFragment
