package other.mvp.activity.src.app_package


/**
 *  @Author Neo
 *  @Date   2021/6/8
 *  @Env    Viicare-Neo
 *  @Description  mvpBaseView
 */
fun mvpBaseView(
    packageName: String
) = """
package $packageName

interface BaseView<P> {
     fun setPresenter(p:P)
}
    
"""