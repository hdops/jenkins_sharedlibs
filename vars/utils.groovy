def download_toolset(){
    log.info("downloading toolset ... ")
    retry(2){
        sh "hdops download_toolset --branch ${params.GIT_BRANCH} -p ."
    }
    sh "tar zxf toolset.tar.gz -C ${WORKSPACE}"
}