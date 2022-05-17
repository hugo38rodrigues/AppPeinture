import React from "react";
import Navbar from "./Component/Navbar";
import Search_bar from "./Component/Search_bar";

const Home = () => {
  return (
    <div className="Home">
      <Navbar />
      <div className="cnt-Home">
        <h1>Application Pot de Peinture</h1>
        <Search_bar />
      </div>
    </div>
  );
};

export default Home;
