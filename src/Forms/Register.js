import React, { useEffect, useState } from "react";
import { postRequest } from "../service/helper";
export default function Register(){

    const [pvalue,setpValue]=useState();

    useEffect(()=>{
        console.log(pvalue);
    },[pvalue])

    const handleSubmit = () => {
        postRequest('/save',{name:pvalue})
            .then(responseData => {
                console.log(responseData);
            })
            .catch(error => {
                console.error("Failed to send data:", error)
            })
    }
return(
<>
<div>
    <input type="text" onChange={event => {setpValue(event.target.value)}} />
    <button onClick={handleSubmit}>Submit</button>
</div>
</>
);
}