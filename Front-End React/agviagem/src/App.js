import { BrowserRouter, Routes, Route } from "react-router-dom"; 
import Destinos from "./views/Destinos";
import Pacotes from "./views/Pacotes";
import Contato from "./views/Contato";
import Index from "./views/Index";
import Menu from "./components/Menu";
import Footer from "./components/Footer";
import Formas_Pagamento from "./components/Formas_Pagamento"


function App() {
  return (
    <BrowserRouter>
      <Menu />
      <Routes>
        <Route path="/Index" element={<Index/>} />
        <Route path="/Destinos" element={<Destinos/>} />
        <Route path="/Pacotes" element={<Pacotes/>} />
        <Route path="/Contato" element={<Contato/>} />
      </Routes>
      <Formas_Pagamento/>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
