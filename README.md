# Prenos dát - testovacie api

FORMAT: 1A
HOST: https://reqres.in/api

# REST API - Prenos Dát

Daniel Ježík

## GET [/users?page=2]

### LIST USERS [GET]

+ Response 200 (application/json)

        {
            "page": 2,
            "per_page": 3,
            "total": 12,
            "total_pages": 4,
            "data": [
        {
            "id": 4,
            "first_name": "Eve",
            "last_name": "Holt",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg"
        },
        {
            "id": 5,
            "first_name": "Charles",
            "last_name": "Morris",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg"
        },
        {
            "id": 6,
            "first_name": "Tracey",
            "last_name": "Ramos",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg"
        }
        ]
        }
        
## GET [/users/23] 
    
### SINGLE USER NOT FOUND [GET]

+ Response 404 (application/json)

        {
        }
        
## GET [/unknown] 
    
### LIST <RESOURCE> [GET]

+ Response 200 (application/json)

        {
            "page": 1,
            "per_page": 3,
            "total": 12,
            "total_pages": 4,
            "data": [
        {
            "id": 1,
            "name": "cerulean",
            "year": 2000,
            "color": "#98B2D1",
            "pantone_value": "15-4020"
        },
        {
            "id": 2,
            "name": "fuchsia rose",
            "year": 2001,
            "color": "#C74375",
            "pantone_value": "17-2031"
        },
        {
            "id": 3,
            "name": "true red",
            "year": 2002,
            "color": "#BF1932",
            "pantone_value": "19-1664"
        }
        ]
        }

## GET [/unknown/2] 
    
### SINGLE <RESOURCE> [GET]

+ Response 200 (application/json)

        {
        "data": {
        "id": 2,
        "name": "fuchsia rose",
        "year": 2001,
        "color": "#C74375",
        "pantone_value": "17-2031"
         }
        }

## GET [/unknown/23] 

### SINGLE <RESOURCE> NOT FOUND [GET]

+ Response 404 (application/json)

        {
        }

## CREATE [/users]

### CREATE - USER[POST]

+ Response 201 (application/json)

            {
                "name": "morpheus",
                "job": "leader",
                "id": "226",
                "createdAt": "2018-03-21T13:38:44.772Z"
            }

## CRUD [/users/2]   

### GET - SINGLE USER [GET]

+ Response 200 (application/json)

        {
        "data": {
        "id": 2,
        "first_name": "Janet",
        "last_name": "Weaver",
        "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"
        }
        }
            
### PUT - USER [PUT]

+ Response 200 (application/json)

            {
                "name": "morpheus",
                "job": "zion resident",
                "updatedAt": "2018-03-21T17:07:16.074Z"
            }
            
### PATCH - USER [PATCH]

+ Response 200 (application/json)

            {
                "name": "morpheus",
                "job": "zion resident",
                "updatedAt": "2018-03-21T17:10:52.139Z"
            }
            
### DELETE - USER [DELETE]

+ Response 204
