import react from "react";
import ImgPagamentos from "../components/imagens/forma-de-pagamento-grande.png"
import Style from "../App.css";

export default function Pagamentos(){
    return(<>
    <div class="d-flex justify-content-center">
        <img class="FormaPagamento" src={ImgPagamentos} alt="Formas De Pagamento" />
    </div>
    </>)
}