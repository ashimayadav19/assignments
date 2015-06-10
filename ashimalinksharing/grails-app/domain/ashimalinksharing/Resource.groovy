package ashimalinksharing

class Resource {


 String description
String title
Date datecreated
Date lastupdated
static belongsTo=[topic: Topic,user:User]
static hasMany=[readingitem: ReadingItem, resourcerating: ResourceRating]

    static constraints = {

description (size:1..1024)
title(unique:'topic')
    }

static mapping={
tablePerHierarchy:false
}
}