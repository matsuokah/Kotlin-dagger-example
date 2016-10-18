package jp.matsuokah.kotlin_dagger_sample.di;


import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import jp.matsuokah.kotlin_dagger_sample.math.RandomNumberCreator;
import jp.matsuokah.kotlin_dagger_sample.math.RandomNumberCreatorImpl;

@Module
public class ApplicationModule {
   private final Application application;

   public ApplicationModule(Application application) {
      this.application = application;
   }

   @Provides
   @AppScope
   Context provideApplicationContext() {
      return this.application.getApplicationContext();
   }

   @Provides
   @AppScope
   RandomNumberCreator provideRandomNumberCreator(RandomNumberCreatorImpl impl) {
      return impl;
   }
}