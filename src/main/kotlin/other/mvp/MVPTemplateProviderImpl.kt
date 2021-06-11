package other.mvp

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.mvp.activity.mvpActivityTemplate


/**
 *  @Author Neo
 *  @Date   2021/6/7
 *  @Env    Viicare-Neo
 *  @Description  SamplePluginTemplateProviderImpl
 */
class MVPTemplateProviderImpl: WizardTemplateProvider() {


    override fun getTemplates(): List<Template> {
        return listOf(
            // activity 模板
            mvpActivityTemplate
        )
    }
}