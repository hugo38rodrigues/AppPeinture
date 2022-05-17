import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Pages/Home";
import Maquette from "./Pages/Maquette";
import Peinture from "./Pages/Peinture";
import NotFound from "./Pages/NotFound";
const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" exact element={<Home />} />
        <Route path="Maquette" exact element={<Maquette />} />
        <Route path="Peinture" exact element={<Peinture />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
};

export default App;
