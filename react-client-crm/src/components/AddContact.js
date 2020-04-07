import React from 'react'

const AddContact = () => {

    const submitContact = (e) => {
        e.preventDefault();
        let newContact = {
            [e.target.name]:[e.target.value]
        };
        fetch("http://localhost:4444/api/contacts", {
            method: 'POST',
            headers: {
                "content-type": "application/json"
            },
            body: JSON.stringify(newContact)
        }).then(response => response.json());

        window.location.reload();

    }

    return (
        <div className="row">
            <form className="col s12" onSubmit={() => this.submitContact}>
                <div className="row">
                    <div className="input-field col s6">
                        <input placeholder="Placeholder" name="firstName" type="text" className="validate" />
                        <label htmlFor="firstName">First Name</label>
                    </div>
                    <div className="input-field col s6">
                        <input name="lastName" type="text" className="validate" />
                        <label htmlFor="lastName">Last Name</label>
                    </div>
                </div>
                <div className="row">
                    <div className="input-field col s12">
                    <input name="email" type="text" className="validate" />
                        <label htmlFor="email">Email</label>
                    </div>
                </div>
                <div className = "row">
                    <button className="waves-effect waves-light btn" type="submit" name="submit"> SUBMIT </button>
                </div>
            </form>
        </div>
    )
}

export default AddContact
