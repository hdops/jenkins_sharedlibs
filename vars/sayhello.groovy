def call(String name="buhaiqing"){  
    if (env.debug){
        log.info "it is on debug mode"
        log.info "do nothing..."
    }else{
        log.warning "hello ${name}"       
    }  
}