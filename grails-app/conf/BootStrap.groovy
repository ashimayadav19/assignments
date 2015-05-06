import ashimalinksharing.*

class BootStrap {

   

 def init = { servletContext ->
 

createUser()
//createTopics()
   }




void createUser(){
 User user=new User(fname:"ashima",email:"ashima19@gmail.com",userName:"ashima123",password:"pass123",confirmPassword:"pass123",lname:"yadav",admin:true,active:false);
  user.save(failOnError:true)
  User user1=new User(fname:"reena",email:"reena@gmail.com",userName:"reena1",password:"123ree",confirmPassword:"123ree",lname:"kumari",admin:false,active:false);
    user1.save(failOnError:true)
   User user2=new User(fname:"ajay",email:"ajay@gmail.com",userName:"ajaysingh",password:"heyyou",confirmPassword:"heyyou",lname:"singh",admin:false,active:false);
      user2.save(failOnError:true)



}


/*


void createTopics(){
    
        List users1=User.list();
        users1.each {user->
              5.times{
                Topic topic=new Topic(name:"groovy" ,visibility:PUBLIC )
                user.addToTopics(topic)
                user.addToSubscriptions(new Subscription(topic:topic,Seriousness:SERIOUS))
                user.save(failOnError:true);
	
        }

	}
 }



*/
    def destroy = {
    }


}
