import React from "react";

class CountPeople extends React.Component {

    constructor() {
        super();

        this.state = {
            entrycount: 0,
            exitcount: 0
        };
    }

    updateEntry() {
        this.setState((prevState) => {
            return {
                entrycount: prevState.entrycount + 1
            };
        });
    }

    updateExit() {
        this.setState((prevState) => {
            return {
                exitcount: prevState.exitcount + 1
            };
        });
    }

    render() {

        return (

            <div style={{ marginTop: "120px", textAlign: "center" }}>

                <button onClick={() => this.updateEntry()}>
                    Login
                </button>

                <span> {this.state.entrycount} People Entered!!!</span>

                <span style={{ marginLeft: "250px" }}>

                    <button onClick={() => this.updateExit()}>
                        Exit
                    </button>

                    <span> {this.state.exitcount} People Left!!!</span>

                </span>

            </div>

        );
    }
}

export default CountPeople;