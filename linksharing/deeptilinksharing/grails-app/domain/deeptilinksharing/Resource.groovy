package deeptilinksharing
import deeptilinksharing.*

class Resource {
 String description
String title
Date dateCreated
Date lastUpdated
User creator
static belongsTo=[topic: Topic]
static hasMany=[readingitem: ReadingItem, resourcerating: ResourceRating]

    static constraints = {
creator nullable:true
description (size:1..1024)
title(unique:'topic')
    }

static mapping={
tablePerHierarchy false
}
}