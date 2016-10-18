package jp.matsuokah.kotlin_dagger_sample.di;

import dagger.Component;
import jp.matsuokah.kotlin_dagger_sample.MainActivity;
import jp.matsuokah.kotlin_dagger_sample.SampleApplication;

@AppScope
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    void inject(SampleApplication app);
    void inject(MainActivity activity);
}