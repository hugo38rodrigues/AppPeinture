import React from "react";
import { NavLink } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHouseChimney } from "@fortawesome/free-solid-svg-icons";

const NotFound = () => {
  return (
    <div className="NotFound">
      <NavLink exact to="/">
        <FontAwesomeIcon icon={faHouseChimney} />
      </NavLink>
      <span>Erreur 404 Retour à l'acceuil</span>
    </div>
  );
};

export default NotFound;
