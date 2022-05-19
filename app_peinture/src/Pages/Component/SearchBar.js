import React from "react";
// import { useState } from "react";

const SearchBar = (props) => {
  // const [text, setText] = useState("");
  // props.filter((post) => {
  //   if (text === "") {
  //     //if query is empty
  //     return post;
  //   } else if (post.title.toLowerCase().includes(text.toLowerCase())) {
  //     //returns filtered array
  //     return post;
  //   }
  // });
  // //! remonter l'état de post dans home et faire le map
  return (
    <div className="ctn-SearchBar">
      <input
        type="search"
        // onChange={(event) => setText(event.target.value)}
        placeholder="🔎Chercher une maquette"
      />
    </div>
  );
};

export default SearchBar;
