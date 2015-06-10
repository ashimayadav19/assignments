package ashimalinksharing

class Subscription {

enum Seriousness
{
SERIOUS, VERYSERIOUS, CASUAL
}

Date datecreated
Seriousness seriousness
static belongsTo=[user:User, topic:Topic]


    static constraints = {

seriousness (blank:false, nullable:false)
    }
}
