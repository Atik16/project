import axios from "axios";

const BASE_URL = "http://localhost:8080/user";

export const getRequest = async (endpoint) => {
    try {
        const response = await axios.get(`${BASE_URL}${endpoint}`);
        return response.data;

    } catch (error)
    {
        console.error("GET request error:",error);
        throw error;
    }
};

export const postRequest = async (endpoint, data) => {
    try {
        const response = await axios.post(`${BASE_URL}${endpoint}`, data, {
            headers: {'Content-Type': 'application/json'},
        });
        return response.data;
    } catch(error){
        console.error("POST request error:",error);
        throw error;
    }
}