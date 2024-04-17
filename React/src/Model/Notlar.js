import React from 'react';
import axios from 'axios';

class Notlar extends React.Component
{
    constructor(props) {
        super(props)
        this.state = {
            Ogrenciler: [],
            SinavTuruler: [],
            Notlar: []
        }
    }

    componentDidMount()
    {
        axios.get('http://localhost:8080/ogrenci').then((res) =>
        {
            this.setState({ Ogrenciler: res.data });
        });
        axios.get('http://localhost:8080/sinavTuru').then((res) =>
        {
            this.setState({ SinavTuruler: res.data });
        });
        axios.get('http://localhost:8080/notlar').then((res) =>
        {
            this.setState({ Notlar: res.data });
        });
    }

    onChange = event => {

        const value = event.target.value
        const names = event.target.name

        this.setState({
            [names]: value
        });
    };

    PostSinavNotu = event => {

        event.preventDefault();

        const body = {
            ogrenciSinavTuru: {
                ogrenci: {
                    ogrenciId: document.getElementById("ogrenciId").value
                },
                sinavTuru: {
                    sinavTuruId: document.getElementById("sinavTuruId").value
                },
            },
            not: this.state.sinavNotu,
        }

        axios.post('http://localhost:8080/notlar', body)
            .then((res) => {
                axios.get('http://localhost:8080/notlar').then((res) =>
                {
                    this.setState({ Notlar: res.data });
                });        
            });
    }

    render(){
        return (
            <div>
                <label>Öğrenci: </label>
                <select name="ogrenciId" id="ogrenciId" onChange={this.onChange}>
                {
                    this.state.Ogrenciler.map(
                        ogrenci =>    
                            <option value={ogrenci.ogrenciId}>{ogrenci.adSoyad}</option>   
                    )
                }
                </select>

                <br/>

                <label>Sınav Türü: </label>
                <select name="sinavTuruId" id="sinavTuruId" onChange={this.onChange}>
                {
                    this.state.SinavTuruler.map(
                        sinavTuru =>    
                            <option value={sinavTuru.sinavTuruId}>{sinavTuru.sinavTuruAdi}</option>   
                    )
                }
                </select>
                <br/>
                <label>Sınav Notu: </label>
                <input type="text" name="sinavNotu" className="form-control"
                    onChange={this.onChange}
                    />

                <br/>
                <button style={{ marginLeft: "10px" }} class="btn btn-primary" type="submit" onClick={this.PostSinavNotu}>Not Ekle</button>

                <br/>
                <br/>
                <br/>
                <label>Notlar: </label>
                {
                    this.state.Notlar.map(
                        not =>                        
                            <tr>                        
                                <td><b>Ad Soyad:</b></td><td>{not.ogrenciSinavTuru.ogrenci.adSoyad}</td>
                                <td><b>Sınav Türü:</b></td><td>{not.ogrenciSinavTuru.sinavTuru.sinavTuruAdi}</td>
                                <td><b>Not:</b></td><td>{not.not}</td>
                            </tr>
                    )
                }

            </div>
        )
    }
}

export default Notlar;