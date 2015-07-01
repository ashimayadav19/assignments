package deeptilinksharing
import deeptilinksharing.*;
class Topic {

 	String name
	Date dateCreated
		Date lastUpdated
	Visibility visibility
	static belongsTo=[user:User]
static hasMany= [resource: Resource, subscription:Subscription]

    static constraints = {

visibility (blank:false,nullable:false)
name (unique:'user')


    }
}
