package other.mvp.activity.src.app_package


/**
 *  @Author Neo
 *  @Date   2021/6/8
 *  @Env    Viicare-Neo
 *  @Description  mvpBasePresenter
 */
fun mvpBasePresenter(
    packageName:String
)="""
package $packageName

interface BasePresenter {

    fun subscribe()

    fun unSubscribe()
}
"""