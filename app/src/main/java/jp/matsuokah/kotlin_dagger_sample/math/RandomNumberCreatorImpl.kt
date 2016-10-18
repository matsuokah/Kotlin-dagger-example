package jp.matsuokah.kotlin_dagger_sample.math

import jp.matsuokah.kotlin_dagger_sample.di.AppScope
import javax.inject.Inject

@AppScope
class RandomNumberCreatorImpl: RandomNumberCreator {
    @Inject
    constructor() {}

    override fun create(): Int = (Math.random() * 100).toInt()
}
