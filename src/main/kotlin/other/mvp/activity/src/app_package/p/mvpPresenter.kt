package other.mvp.activity.src.app_package.p


/**
 *  @Author Neo
 *  @Date   2021/6/8
 *  @Env    Viicare-Neo
 *  @Description  mvpPresenter
 */

fun mvpPresenter (
    applicationPackage: String?,
    packageName:String,
    activityClass: String
)="""
package $packageName.p

import ${applicationPackage}.contract.${activityClass}Contract
class ${activityClass}Presenter(private val mView: ${activityClass}Contract.View): ${activityClass}Contract.Presenter {
    init {
        // TODO something
        mView.setPresenter(this)
    }
    
    override fun subscribe() {
    
    }
    
    override fun unSubscribe() {
    
    }
} 

"""