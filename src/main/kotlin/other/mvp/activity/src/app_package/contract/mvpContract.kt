package other.mvp.activity.src.app_package.contract


/**
 *  @Author Neo
 *  @Date   2021/6/8
 *  @Env    Viicare-Neo
 *  @Description  mvpContract
 */

fun mvpContract(
    packageName:String,
    activityName:String
)="""
package $packageName.contract

import ${packageName}.BaseView
import ${packageName}.BasePresenter

interface ${activityName}Contract {
    interface View: BaseView<Presenter> {
        
    }
    
    interface Presenter: BasePresenter {
        
    }
}
    
"""