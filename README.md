
# Project Title

There are different ways to implement API versioning in your application. The most popular of them are:

- **URI path** – include the version number in the URL path of the endpoint, for example, /api/v1/employee.
- **Query parameters** - keep the base URL the same, but we pass version information through the request parameter.
- **HTTP headers** - specify a custom header in the request and the server-side identify the actual controller method through this custom header.
- **Media type versioning** - the existing Accept header to pass version information to the server, consumers need to specify which version it can accept.

