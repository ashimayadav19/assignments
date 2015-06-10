package ashimalinksharing

class User {

	String email
	String userName
	String password
	String confirmPassword
	String fname
	String lname
	Byte[] photo
	Boolean admin
	Boolean active
	Date dateCreated
	Date lastUpdated
	
	static hasMany=[topic:Topic, subscription: Subscription, resource:Resource,readingitem:ReadingItem,resourcerating:ResourceRating]


    static constraints = {

	email(unique:true,blank:false,nullable:false,email:true)
	password(validator:{val,obj->
if(val==obj.confirmPassword)
return true
else
return ["Passwords doesnot match"]
})

photo(nullable:true,blank:true 	)	

    }
}
