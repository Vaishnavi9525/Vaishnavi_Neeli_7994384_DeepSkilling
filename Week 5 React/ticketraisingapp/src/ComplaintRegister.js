import { useState } from "react";

function ComplaintRegister() {

    const [employeeName, setEmployeeName] = useState("");
    const [complaint, setComplaint] = useState("");

    function handleSubmit(event) {

        event.preventDefault();

        const referenceNumber = Math.floor(Math.random() * 1000);

        alert(
            "Thanks " +
            employeeName +
            "\nYour Complaint was Submitted.\nReference Number: " +
            referenceNumber
        );
    }

    return (

        <div>

            <h2 style={{ color: "red" }}>
                Register your complaints here!!!
            </h2>

            <form onSubmit={handleSubmit}>

                <table>

                    <tbody>

                        <tr>
                            <td>Name:</td>
                            <td>
                                <input
                                    type="text"
                                    value={employeeName}
                                    onChange={(e) => setEmployeeName(e.target.value)}
                                />
                            </td>
                        </tr>

                        <tr>
                            <td>Complaint:</td>
                            <td>
                                <textarea
                                    rows="5"
                                    cols="30"
                                    value={complaint}
                                    onChange={(e) => setComplaint(e.target.value)}
                                >
                                </textarea>
                            </td>
                        </tr>

                        <tr>
                            <td></td>
                            <td>
                                <button type="submit">
                                    Submit
                                </button>
                            </td>
                        </tr>

                    </tbody>

                </table>

            </form>

        </div>

    );
}

export default ComplaintRegister;