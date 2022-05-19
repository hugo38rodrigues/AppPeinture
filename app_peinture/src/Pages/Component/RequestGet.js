import React from "react";
import axios from "axios";
import { useState, useEffect } from "react";

const RequestGet = (props) => {
  const [request, setRequest] = useState();

  useEffect(() => {
    axios.get(props.data).then((res) => {
      const data_request = res.data;
      this.setRequest({ data_request });
    });

    console.log(request);
  }, [setRequest]);

  return <div className="ctn-axios">{/* <ul>{request.map}</ul> */}</div>;
};

export default RequestGet;
