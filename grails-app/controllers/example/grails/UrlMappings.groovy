package example.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
//asdsadasdsad
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
