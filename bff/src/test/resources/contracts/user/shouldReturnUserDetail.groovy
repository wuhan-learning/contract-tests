package user

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/api/users/admin'
    }
    response {
        status 200
        headers {
            contentType("application/json")
        }
        body([
                userName: "admin",
                age     : 18,
                email   : "admin@thoughtworks.com",
                mobile  : "1334983****",
                remark  : "system root user",
        ])
    }
}
