$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NumberOfCircuits.feature");
formatter.feature({
  "line": 1,
  "name": "Test number of circuits for year 2017",
  "description": "",
  "id": "test-number-of-circuits-for-year-2017",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Number of circuits test scenario",
  "description": "",
  "id": "test-number-of-circuits-for-year-2017;number-of-circuits-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "url for get request",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user sends request",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "status code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "size of circuit id is 20",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "response headers includes the following",
  "rows": [
    {
      "cells": [
        "Proxy-Connection",
        "Keep-Alive"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "NumberofCircuitID_StepDef.url_for_get_request()"
});
formatter.result({
  "duration": 118845844,
  "status": "passed"
});
formatter.match({
  "location": "NumberofCircuitID_StepDef.user_sends_request()"
});
formatter.result({
  "duration": 2704289855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 15
    }
  ],
  "location": "NumberofCircuitID_StepDef.status_code_is(int)"
});
formatter.result({
  "duration": 64373681,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 22
    }
  ],
  "location": "NumberofCircuitID_StepDef.size_of_circuit_id_is(int)"
});
formatter.result({
  "duration": 532196314,
  "status": "passed"
});
formatter.match({
  "location": "NumberofCircuitID_StepDef.response_headers_includes_the_following(String,String\u003e)"
});
formatter.result({
  "duration": 10570197,
  "status": "passed"
});
formatter.uri("postRequest.feature");
formatter.feature({
  "line": 1,
  "name": "post request using resreq site",
  "description": "",
  "id": "post-request-using-resreq-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "post a rest request api",
  "description": "",
  "id": "post-request-using-resreq-site;post-a-rest-request-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "post url for send request",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user post request",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "post request status code is 201",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "post response body contains",
  "rows": [
    {
      "cells": [
        "name",
        "morpheus"
      ],
      "line": 9
    },
    {
      "cells": [
        "job",
        "leader"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "post response headers contains",
  "rows": [
    {
      "cells": [
        "Connection",
        "keep-alive"
      ],
      "line": 12
    },
    {
      "cells": [
        "Content-Type",
        "application/json; charset\u003dutf-8"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PostRequest_stepDefinition.post_url_for_send_request()"
});
formatter.result({
  "duration": 7235087,
  "status": "passed"
});
formatter.match({
  "location": "PostRequest_stepDefinition.user_post_request()"
});
formatter.result({
  "duration": 670325723,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 28
    }
  ],
  "location": "PostRequest_stepDefinition.post_request_status_code_is(int)"
});
formatter.result({
  "duration": 561707,
  "status": "passed"
});
formatter.match({
  "location": "PostRequest_stepDefinition.post_response_body_contains(String,String\u003e)"
});
formatter.result({
  "duration": 23401434,
  "status": "passed"
});
formatter.match({
  "location": "PostRequest_stepDefinition.post_response_headers_contains(String,String\u003e)"
});
formatter.result({
  "duration": 939862,
  "status": "passed"
});
});