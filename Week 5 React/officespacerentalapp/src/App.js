import office from "./office.jpg";
import "./App.css";

function App() {

    const element = "Office Space";

    const jsxatt =
        <img
            src={office}
            width="25%"
            height="25%"
            alt="Office Space"
        />;

    const officeList = [
        {
            Name: "DBS",
            Rent: 50000,
            Address: "Chennai"
        },
        {
            Name: "Regus",
            Rent: 65000,
            Address: "Bangalore"
        },
        {
            Name: "WeWork",
            Rent: 55000,
            Address: "Hyderabad"
        }
    ];

    return (

        <div className="container">

            <h1>{element}, at Affordable Range</h1>

            {
                officeList.map((item, index) => (

                    <div key={index}>

                        {jsxatt}

                        <h1>Name: {item.Name}</h1>

                        <h3
                            style={{
                                color:
                                    item.Rent <= 60000
                                        ? "red"
                                        : "green"
                            }}
                        >
                            Rent: Rs. {item.Rent}
                        </h3>

                        <h3>
                            Address: {item.Address}
                        </h3>

                        <br />

                    </div>

                ))
            }

        </div>

    );

}

export default App;