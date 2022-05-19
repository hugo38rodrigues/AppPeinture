import React from "react";
import Navbar from "./Component/Navbar";
import RequestGet from "./Component/RequestGet";
import SearchBar from "./Component/SearchBar";

const Home = () => {
  return (
    <div className="Home">
      <Navbar />
      <div className="cnt-Home">
        <h1>Application Pot de Peinture</h1>
        <SearchBar />
      </div>
      <div className="prj-maquette">
        <RequestGet data="../../asset/output.json" />
      </div>
    </div>
  );
};

export default Home;
