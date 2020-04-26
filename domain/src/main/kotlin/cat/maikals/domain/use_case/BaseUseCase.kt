package cat.maikals.domain.use_case

import cat.maikals.domain.entities.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn

abstract class BaseUseCase<Params, T> {

    operator fun invoke(params: Params): Flow<Result<T>> =
        buildAsyncCall(params)
            .flowOn(Dispatchers.IO)
            .catch { Result.Error(Exception(it)) }

    protected abstract fun buildAsyncCall(params: Params): Flow<Result<T>>
}