package other.mvp.activity.src.app_package.v


/**
 *  @Author Neo
 *  @Date   2021/6/7
 *  @Env    Viicare-Neo
 *  @Description  mvpActivityKt
 */
fun mvpActivityKt (
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String
)="""
package $packageName.v

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ${applicationPackage}.p.${activityClass}Presenter
import ${applicationPackage}.contract.${activityClass}Contract

class ${activityClass}Activity : AppCompatActivity (),${activityClass}Contract.View {

    private lateinit var mPresenter: ${activityClass}Contract.Presenter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.${layoutName})
        
        // TODO something
        ${activityClass}Presenter(this)
    }

    override fun setPresenter (p: ${activityClass}Contract.Presenter) {
        this.mPresenter = p
        this.mPresenter.subscribe()
    }
}
"""