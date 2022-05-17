import React from "react";
import { NavLink } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHouseChimney } from "@fortawesome/free-solid-svg-icons";
import { faJetFighter } from "@fortawesome/free-solid-svg-icons";
import { faFill } from "@fortawesome/free-solid-svg-icons";

const Navbar = () => {
  return (
    <div className="Navbar">
      <NavLink exact to="/">
        <FontAwesomeIcon icon={faHouseChimney} />
      </NavLink>

      <NavLink exact to="/Maquette">
        <FontAwesomeIcon icon={faJetFighter} />
      </NavLink>

      <NavLink exact to="/Peinture">
        <FontAwesomeIcon icon={faFill} />
      </NavLink>
    </div>
  );
};

export default Navbar;
