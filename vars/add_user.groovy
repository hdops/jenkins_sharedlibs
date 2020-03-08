import jenkins.model.*

def call(username,password){
  Jenkins.getInstance().securityRealm.createAccount(username,password)
  echo "add user `${username}` successfully"
}