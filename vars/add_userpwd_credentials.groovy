import jenkins.model.*
import com.cloudbees.plugins.credentials.impl.*;
import com.cloudbees.plugins.credentials.*;
import com.cloudbees.plugins.credentials.domains.*;

/**
创建一个username/password 的credential
*/
def call(name,user,password){
    Credentials c = (Credentials) new UsernamePasswordCredentialsImpl(CredentialsScope.GLOBAL,name, "", user, password)
    
    SystemCredentialsProvider.getInstance().getStore().addCredentials(Domain.global(), c)
    echo "add credential `${name}` successfully"
}