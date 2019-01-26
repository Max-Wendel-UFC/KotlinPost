package repository

import entity.FullParameters
import entity.HttpResponse

class PostRepository private constructor(){

    companion object: BaseRepository() {

        fun getAllPost(fullParameters: FullParameters):HttpResponse{
            return super.execute(fullParameters)
        }

        fun getSinglePost(fullParameters: FullParameters):HttpResponse{
            return super.execute(fullParameters)
        }
    }

}