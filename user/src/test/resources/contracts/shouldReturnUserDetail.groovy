import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/users/admin'
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
                mobile  : "13349837355",
                remark  : "system root user",
        ])
    }
}
