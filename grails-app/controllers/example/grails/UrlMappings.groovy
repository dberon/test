package example.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
//asdsadasdsad 1231232
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
