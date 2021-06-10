package other.mvp.activity.res.layout


/**
 *  @Author Neo
 *  @Date   2021/6/7
 *  @Env    Viicare-Neo
 *  @Description  mvpActivityXml
 */
fun mvpActivityXml(packageName: String,
                   activityClass: String
)="""
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="19dp"
    tools:context="${packageName}.v.${activityClass}Activity"
    >
    
</androidx.constraintlayout.widget.ConstraintLayout>   
"""