import React, { useEffect, useState } from "react";

export default function Register(){

    const [value,setValue]=useState();

    useEffect(()=>{
        console.log(value);
    },[value])
return(
<>
<div>
    <input type="text" onChange={event => {setValue(event.target.value)}} />
    <button>Submit</button>
</div>
</>
);
}